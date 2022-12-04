### Postwork

OPERACIONES DE INFRAESTRUCTURA COMO CÓDIGO (ANSIBLE, TERRAFORM Y PACKER

Objetivo

- Iniciar con el proyecto final myAPI.
- Definir contenedor Microservicio
- Desplegar servidor cloud

Windows Powershell

Vamos a la página oficial de terraform en sección descargas:
https://www.terraform.io/downloads.html.
En ella encontramos las ligas a los archivos binarios.
Copiamos la liga de la versión compatible para nuestro cpu, por ejemplo amd64 y la utilizamos en powershell para guardar ese zip en home:

![Postwork1.6.1](https://github.com/yessespinosa/HSBC-BEDU-Developer-Engineering/blob/main/1.%20Desarrollo%20de%20software%20%C3%A1gil/06.%20Operaciones%20de%20infraestructura%20como%20c%C3%B3digo%20(ansible%2C%20terraform%20y%20packer)/images/1.6.Postwork1.JPG)

Expandimos el zip

Agregamos terraform al path, para facilitar su ejecución. Cada vez que se abre una nueva consola powershell, exportamos la variable de entorno al PATH.

$env:Path += ";$home/terraform"

Validamos la instalación

terraform –version

![Postwork1.6.2](https://github.com/yessespinosa/HSBC-BEDU-Developer-Engineering/blob/main/1.%20Desarrollo%20de%20software%20%C3%A1gil/06.%20Operaciones%20de%20infraestructura%20como%20c%C3%B3digo%20(ansible%2C%20terraform%20y%20packer)/images/1.6.Postwork2.JPG)

