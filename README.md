# Spring-Cloud-Config-Demo
A simple demo of spring cloud config

很简单的代码，每个项目只包含一个java类和一个配置文件。

启动步骤


	1. 先启动config-server配置服务器，原默认端口为8888，这里已改为8800
	
	2. 浏览器输入[http://localhost:8800](http://localhost:8800)。如果返回下列内容，则启动成功
	
		{"name":"config-client","profiles":["dev"],"label":null,"version":null,"state":null,"propertySources":[{"name":"https://github.com/Wang-Juntao/Spring-Cloud-Config-Demo/config/config-client-dev.properties","source":{"democonfigclient.message":"hello spring io","foo":"foo version 4"}}]}

	3.启动config-client，浏览器输入[http://localhost:8080](http://localhost:8080)。如果返回以下内容，则配置获取成功
		{"appName":"config-client","foo":"foo version 4","message":"hello spring io"}
