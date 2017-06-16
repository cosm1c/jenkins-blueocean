#!/usr/bin/env groovy
import hudson.security.*
import jenkins.model.*

def instance = Jenkins.getInstance()

instance.setNumExecuters(8)

def locationConfig = instance.getDescriptor('JenkinsLocationConfiguration')
locationConfig.setUrl("http://${InetAddress.getLocalHost().getCanonicalHostName()}:8080/".toString())
//locationConfig.setAdminAddress('Firstname Surname <somewhere@email.com>')

instance.save()
