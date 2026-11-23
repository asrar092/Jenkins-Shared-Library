def call(String ProjectName){
   withCredentials([usernamePassword(
          credentialsId: 'dockerhub',
          usernameVariable: 'dockerHubUser',
          passwordVariable: 'dockerHubPass')]){
   sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
   sh "docker tag ${ProjectName} ${env.dockerHubUser}/${ProjectName}"
   sh "docker push ${env.dockerHubUser}/${ProjectName}"
   }
}
