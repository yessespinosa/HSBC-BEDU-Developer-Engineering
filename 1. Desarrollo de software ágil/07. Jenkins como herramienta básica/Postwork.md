## Actividad 01

1) Instalación y configuración de Jenkins

Sigue las instrucciones del prework para que configures el contenedor que tienes corriendo, ejecuta por primera vez, instala plugins y configura variables de ambiente. Agrega un volumen a la ruta /var/jenkins_home, así las configuraciones que se hagan no se perderán al recrear el contenedor.

2) Crear proyecto para tu microservicio

Crea un nuevo proyecto en Jenkins, tipo pipeline, que clone el código fuente del repositorio de books y ejecute jenkins file que se encuentra en la carpeta de postwork para la lección y el repositorio.

3) Prueba el proyecto de tu microservicio

Ejecuta el proyecto y resuelve errores de ejecución.

### Desarrollo

Repositorio con archivos necesarios para instalación de jenkins: 

https://github.com/yessespinosa/myAPI-terraform

Se ejecuta la siguiente secuencia de instrucciones: 

```sh
terraform fmt
terraform init
terraform plan
terraform apply
```
![Postwork1.7.1](https://github.com/yessespinosa/HSBC-BEDU-Developer-Engineering/blob/main/1.%20Desarrollo%20de%20software%20%C3%A1gil/07.%20Jenkins%20como%20herramienta%20b%C3%A1sica/images/1.7.1.Postwork.JPG)

Comprobamos la correcta instalación de jenkins en: 

http://127.0.0.1:8080/

Y nos muestra la siguiente pantalla: 

![Postwork1.7.3](https://github.com/yessespinosa/HSBC-BEDU-Developer-Engineering/blob/main/1.%20Desarrollo%20de%20software%20%C3%A1gil/07.%20Jenkins%20como%20herramienta%20b%C3%A1sica/images/1.7.3.Postwork.JPG)

Obtenemos la contraseña: 
```sh
docker exec jenkins cat /var/jenkins_home/secrets/initialAdminPassword
```
Se instalan los plugins mencionados en el prework 
- Pipeline
- Docker
- Docker Pipeline
- Environment Injector
- Git
- GitHub
- GitHub Authenticator

Verificamos los contenedores en Docker: 
![Postwork1.7.4](https://github.com/yessespinosa/HSBC-BEDU-Developer-Engineering/blob/main/1.%20Desarrollo%20de%20software%20%C3%A1gil/07.%20Jenkins%20como%20herramienta%20b%C3%A1sica/images/1.7.4.Postwork.JPG)

Se ejecuta lo siguiente: 
```sh
docker exec -it -u root jenkins /bin/bash
chown jenkins:jenkins /var/run/docker.sock
ls -lah /var/run/docker.sock
docker container list
```

![Postwork1.7.5](https://github.com/yessespinosa/HSBC-BEDU-Developer-Engineering/blob/main/1.%20Desarrollo%20de%20software%20%C3%A1gil/07.%20Jenkins%20como%20herramienta%20b%C3%A1sica/images/1.7.5.Postwork.JPG)

En Jenkins se agregan las siguientes variables de entorno: 
MYSQL_IP - 172.17.0.3
MYSQL_PASSWORD - abcD_1234
MYSQL_USER - root

![Postwork1.7.6](https://github.com/yessespinosa/HSBC-BEDU-Developer-Engineering/blob/main/1.%20Desarrollo%20de%20software%20%C3%A1gil/07.%20Jenkins%20como%20herramienta%20b%C3%A1sica/images/1.7.6.Postwork.JPG)

Cargamos los siguientes 2 repositorios como pipelines en Jenkins

https://github.com/yessespinosa/myAPI-books

https://github.com/yessespinosa/myapi-accounts

Y comprobamos su correcta ejecución: 

![Postwork1.7.7](https://github.com/yessespinosa/HSBC-BEDU-Developer-Engineering/blob/main/1.%20Desarrollo%20de%20software%20%C3%A1gil/07.%20Jenkins%20como%20herramienta%20b%C3%A1sica/images/1.7.7.Postwork.JPG)





