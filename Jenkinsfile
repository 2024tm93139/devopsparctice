def build_success=false
pipeline{
  agent any
  stages{
    stage("build"){
      steps{
        def cdir=this.pwd()
        echo("Inside build {$cdir}")
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
