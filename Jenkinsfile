def build_success=false;
pipeline{
  agent any
  stages{
    stage("build"){
      steps{
        echo("Inside build")
        currentdir=pwd();
        echo($currentdir);
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
