pipeline {
    agent any
    stages {
        stage("Release scope") {
            steps {
                script {
                    // Prepare a list and write to file
                    def pobj=load "ProjectList.groovy"
	                List<String> plist= pobj.ProjectList()
			echo "plist is ${plist}"
                    // Show the select input
                    env.ProjectList = input message: 'User input required', ok: 'ProjectList!',
                            parameters: [choice(name: 'ProjectList', choices: plist, description: 'What is the Project Name?')]
                }
                echo "Release scope selected: ${env.ProjectList}"
            }
        }
    }
}
