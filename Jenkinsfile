pipeline {
    agent any
    stages {
        stage("Release scope") {
            steps {
                script {
                    // Prepare a list and write to file
                  env.list=['hey','hi']

                    // Show the select input
                    env.RELEASE_SCOPE = input message: 'User input required', ok: 'Release!',
                            parameters: [choice(name: 'RELEASE_SCOPE', choices: env.LIST, description: 'What is the release scope?')]
                }
                echo "Release scope selected: ${env.RELEASE_SCOPE}"
            }
        }
    }
}
