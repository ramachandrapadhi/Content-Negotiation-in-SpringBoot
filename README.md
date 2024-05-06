# Content-Negotiation-in-SpringBoot

Add below dependency

pom.xml
--------
<dependency>
    <groupId>com.fasterxml.jackson.dataformat</groupId>
    <artifactId>jackson-dataformat-xml</artifactId>
</dependency>

build.gradle
-------------
implementation group: 'com.fasterxml.jackson.dataformat', name: 'jackson-dataformat-xml' <br/>

refresh the project <br/>

the default configuration for spring boot is JSON   <br/>
but need do change configutaion <br/>
inside package com.learningtech.config.ContentConfig <br/>
check the configuration <br/>

Test url
----------
need to pass request param like (?mediaType=xml/json) in URL<br/>

URL : localhost:8080/api/user/getallUser  (The default configuration is JSON, So it will return JSON response) <br/>

URL : localhost:8080/api/user/getallUser?mediaType=xml  (this will return XML response)<br/>

URL : localhost:8080/api/user/getallUser?mediaType=json (this will return JSON response)<br/>





