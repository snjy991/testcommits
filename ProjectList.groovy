def ProjectList() {
import groovy.json.JsonSlurper
def json_str = '''{
   "name": "Foo Bar",
   "year": 2018,
   "timestamp": "2018-03-08T00:00:00",
   "tags": [ "person", "employee" ],
   "grade": 3.14 }'''
 
 
def jsonSlurper = new JsonSlurper()
plist = jsonSlurper.parseText(json_str)
return plist
}
