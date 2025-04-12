def build_success=false;
pipeline{
  agent any
  stages{
    stage("build"){
      steps{
        echo("Inside build")
        maven("maven"){
          sh 'mvn clean'
          sh 'mvn build'
        }
      }
    }
    stage("test"){
      steps{
        echo("Inside test")
      }
    }
    stage("deploy"){
      steps{
        echo("Inside deploy")
      }
    }
  }
}
