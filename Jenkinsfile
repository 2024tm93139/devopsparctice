def build_success=false;
def dir=this.pwd;
pipeline{
  agent any
  stages{
    stage("build"){
      steps{
        echo("Inside build {$dir}")
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
