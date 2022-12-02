#### Instrucciones
Con base en la aplicación que has ido desarrollando a lo largo del módulo crearás imágenes Docker y podrás lograr versionar las mismas, tomando en cuenta las siguientes indicaciones:

- Deberás descargar y manipular imágenes Docker.
- Versionar las imágenes creadas.
- Utilizar línea de comandos para comprender la Infraestructura.
- Desplegar un servidor de aplicaciones basado en Docker.

#### Desarrollo
1. Utiliza el repo de Apache

https://hub.docker.com/_/httpd

2. Ejecuta el comando para descargar la Imagen a tu local:
```sh
docker pull httpd
```
3. Ejecuta el siguiente comando:

```sh
docker images
```

4. Verás una indicación similar como la siguiente:
```sh
REPOSITORY      TAG       IMAGE ID       CREATED        SIZE ubuntu-update   latest    31889a5b4786   34 hours ago   104MB httpd           latest    ad17c88403e2   4 days ago     143MB ubuntu          latest    ba6acccedd29   5 weeks ago    72.8MB
```
5. Ahora, levantarás la imagen con lo siguiente:
```sh
docker run -d --name apache-server -p 80:80 httpd
```
Con esto, tendrás el servidor de aplicaciones iniciado

6. Ejecuta lo siguiente:
```sh
docker ps
```
7. Verás algo similar:
```sh
CONTAINER ID   IMAGE     COMMAND              CREATED       STATUS       PORTS                NAMES 65db7597168c   httpd     "httpd-foreground"   2 hours ago   Up 2 hours   0.0.0.0:80->80/tcp   apache-server
```
8. Ubica el Container ID y ejecútalo:
```sh
docker exec -it 5ec19c1e3408 bash
```
9. Una vez dentro de tu contenedor, actualiza:
```sh
apt-get update & apt-get upgrade -y
```
10. Instala un par de tools (wget, zip)
```sh
apt install wget apt install zip
```
11. Ubícate en el path:
```sh
cd /usr/local/apache2/htdocs
```
12. Descarga un zip, con el site a desplegar:
```sh
wget
```
https://github.com/beduExpert/DevOps-Fundamentals-2021/raw/main/Sesion-01/coming-soon-evening-html.zip

13. Descomprime el zip:
```sh
unzip coming-soon-evening-html.zip
```
14. Actualiza el navegador, donde podrás ver el sitio actualizado como se muestra en la imagen.

Estas son las evidencias del postwork 4: 

[![Evidencia 1](https://photos.app.goo.gl/BZY3tqUbs4TT6AVn9)](https://photos.app.goo.gl/BZY3tqUbs4TT6AVn9)
