pipeline {
    agent any
    stages {
        stage("Release scope") {
            steps {
                script {
                   
		def pobj=load "ProjectList.groovy"
		List<String> plist= pobj.ProjectList()
                    // Show the select input
                    env.RELEASE_SCOPE = input message: 'User input required', ok: 'Release!',
                            parameters: [choice(name: 'RELEASE_SCOPE', choices: plist, description: 'What is the release scope?')]
                }
                echo "Release scope selected: ${env.RELEASE_SCOPE}"
            }
        }
    }
}
