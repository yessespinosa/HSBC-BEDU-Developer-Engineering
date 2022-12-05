### Desarrollo
Probar con anterioridad, ayuda a que los errores no lleguen hasta el ambiente de producción. Para esto los pipelines nos ayudan para tener etapas en las que si una falla, las subsiguientes no se ejecutan. Si falla en la etapa de construcción o las pruebas, entonces una etapa de entrega a producción nunca sucedería.

- Configurar el setup de java y maven con Jenkins
- Configurar el Pipeline de despliegue para ejecutar pruebas estáticas con SonarQube
- Configurar maven y el pipeline para escanear las vulnerabilidades del proyecto usando Jenkins y el plugin de OWASP ZAP
- Incorporar Quality Gates para aprobación entre fases del Pipeline Jenkins

https://github.com/yessespinosa/pet-clinic/blob/main/README.md
