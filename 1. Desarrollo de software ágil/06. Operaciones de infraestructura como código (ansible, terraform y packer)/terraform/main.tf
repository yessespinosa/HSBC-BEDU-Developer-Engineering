terraform {
  required_providers {
    docker = {
      source  = "kreuzwerker/docker"
      version = ">= 2.16.0"
    }
  }
}

provider "docker" {
  host = "npipe:////.//pipe//docker_engine"
}

resource "docker_image" "microservice" {
  name = "microservice"
  build {
    path = "../microservice/."
    tag = [
      "microservice:latest"
    ]
  }
}

resource "docker_container" "microservice" {
  image = docker_image.microservice.image_id
  # image = docker_image.microservice.latest # Descomenta esta linea y comenta la de arriba si eres usuario de MacOs o Linux
  name = "microservice-demo"
  ports {
    internal = 5000
    external = 5000
  }
  depends_on = [
    docker_image.microservice
  ]
}