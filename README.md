Build to produce Jenking WAR with blueocean and latest plugin updates.

```
rm -rf ~/.jenkins/ && mvn clean hpi:custom-war && java -jar target/jenkins-blueocean.war
```