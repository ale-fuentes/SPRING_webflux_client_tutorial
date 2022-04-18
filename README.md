## Spring WebFlux | client

![](https://img.shields.io/badge/OS-Windows-informational?style=flat&logo=windows&logoColor=white&color=0078D6)
![](https://img.shields.io/badge/IDE-Eclipse-informational?style=flat&logo=eclipse&logoColor=white&color=2C2255)


![](https://img.shields.io/badge/Framework-Spring-informational?style=flat&logo=Spring&logoColor=white&color=6DB33F)
![](https://img.shields.io/badge/Framework-Spring_Boot-informational?style=flat&logo=SpringBoot&logoColor=white&color=6DB33F)
![](https://img.shields.io/badge/Framework-Thymeleaf-informational?style=flat&logo=Thymeleaf&logoColor=white&color=005F0F)
![](https://img.shields.io/badge/Language-Java-informational?style=flat&logo=Java&logoColor=white&color=007396)

![](https://img.shields.io/badge/Author-Alejandro_Fuentes_|_fuentesra@hotmail.com-informational?style=flat&logoColor=white&color=4a4c4d)

## Starting

some tips for use this code

1. **Install Eclipse** or a another IDE, for eclipse with spring tool, here for [download and install](https://spring.io/tools#suite-three)
2. **clone project** in some folder of work

```
$ git clone https://github.com/ale-fuentes/SPRING_webflux_client_tutorial.git
```

3. **import Maven project**, with our eclipse, import the project, a execute. (note: for default running in port 8080) 

> **NOTE** <br/>
> if port 8081 are busy, using next command for listing all service in port 8081:
> 
> ```
> netstat -ano | findstr LISTENING | findstr 8081
> ```
> 
> if are listing, get `PID` and finish it with next command:
> 
> ```
> taskkill -PID <number> -F
> ```
>
> _

4. **testing in your browser**, with link: `http://localhost:8081/list`