# jenkins-101
jenkins-101 for who want to learning jenkins from scratch.

## Quick Start

```shell
docker compose up -d
```

## to-do-list

* configure build tools: 
  * mvn: not found
* jenkins with gitlab access
  * git plugin type
* pipeline with gitlab
  * setup build tools:
    * maven for build java app
* exposing to network via Cloudflare

## Docs/Tips/MISC...etc

* jenkins
    * [www.jenkins.io/doc/](https://www.jenkins.io/doc/)
        * [www.jenkins.io/doc/tutorials/](https://www.jenkins.io/doc/tutorials/)
    * [www.jenkins.io/doc/pipeline/steps/groovy/](https://www.jenkins.io/doc/pipeline/steps/groovy/)
    * [www.jenkins.io/doc/book/blueocean/](https://www.jenkins.io/doc/book/blueocean/)
    * [Pipeline: Groovy](https://plugins.jenkins.io/workflow-cps/)
    * [github.com/jenkinsci/groovy-sandbox](https://github.com/jenkinsci/groovy-sandbox)
    * [Downloading and running Jenkins in Docker](https://www.jenkins.io/doc/book/installing/docker/#downloading-and-running-jenkins-in-docker)
      * pipeline
        * [doc/tutorials/#tools](https://www.jenkins.io/doc/tutorials/#tools)
        * [doc/pipeline/examples/#artifactory-maven-build](https://www.jenkins.io/doc/pipeline/examples/#artifactory-maven-build)
* Jenkins plugin
  * [gitlab-plugin](https://github.com/jenkinsci/gitlab-plugin)
* groovy
    * [www.geeksforgeeks.org/groovys-domain-specific-language-dsl-for-jenkins-pipelines/](https://www.geeksforgeeks.org/groovys-domain-specific-language-dsl-for-jenkins-pipelines/)
    * [www.jenkins.io/doc/pipeline/steps/workflow-cps/](https://www.jenkins.io/doc/pipeline/steps/workflow-cps/)
    * [groovy-lang.org/documentation.html#gettingstarted](https://groovy-lang.org/documentation.html#gettingstarted)
    * [github.com/apache/groovy](https://github.com/apache/groovy)
    * [groovy.apache.org/download.html](https://groovy.apache.org/download.html)
    * [groovy.apache.org/download.html#osinstall](https://groovy.apache.org/download.html#osinstall)
        * [sdkman.io/sdks/groovy](https://sdkman.io/sdks/groovy)
    * [What password encryption Jenkins is using?](https://stackoverflow.com/questions/25547381/what-password-encryption-jenkins-is-using)    

```shell
sdk install groovy
groovy --version
```
