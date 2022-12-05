
### Desarrollo
Probar con anterioridad, ayuda a que los errores no lleguen hasta el ambiente de producción. Para esto los pipelines nos ayudan para tener etapas en las que si una falla, las subsiguientes no se ejecutan. Si falla en la etapa de construcción o las pruebas, entonces una etapa de entrega a producción nunca sucedería.

- Configurar el setup de java y maven con Jenkins
- Configurar el Pipeline de despliegue para ejecutar pruebas estáticas con SonarQube
- Configurar maven y el pipeline para escanear las vulnerabilidades del proyecto usando Jenkins y el plugin de OWASP ZAP
- Incorporar Quality Gates para aprobación entre fases del Pipeline Jenkins

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



