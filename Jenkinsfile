def build_success=false
pipeline{
  agent any
  stages{
    stage("build"){
      steps{
        var cdir=this.pwd()
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
