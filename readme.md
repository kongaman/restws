# Rest-WebService Screenshots
##  - Spring Boot, Apache-CXF, Postman - 
Basic REST Webservice for a hospital to Create, Read, Update and Delete patients

## Test of GET, POST, PUT und DELETE in Postman with XML dataformat

### GET
![Get all patients](docs/postman-xml-getAll.png)
![Get a single patient](docs/postman-xml-get1.png)

### POST
Make sure to have dataformat set to "application/XML" in the "Body"-Tab
![Create a patient](docs/postman-xml-post.png)

### PUT
Make sure to have dataformat set to "application/XML" in the "Body"-Tab
![Create a patient](docs/postman-xml-put.png)

### DELETE
![Delete a patient](docs/postman-xml-delete.png)


## Test with JSON dataformat

### GET
Make sure to add the Key "Accept" with value "application/json" in the "Headers"-Tab
![JSON Get all patients](docs/postman-json.png)

### POST
Make sure to add the Key "Accept" with value "application/json" in the "Headers"-Tab
AND set the dataformat to "application/json" in the "Body"-Tab
![JSON Create a patient](docs/postman-json-post.png)
<br><br>

If you don't set the Key "Accept" with value "application/json" you will send json and get
XML in return ;-)
![JSON XML mixed](docs/postman-json-xml.png)
<br><br>

## Errorhandling

### Custom error message
![custom errormessage](docs/postman-json-errormessage.png)




