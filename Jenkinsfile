pipeline{
    agent any
    parameters {
    def pobj=load "ProjectList.groovy"
	List<String> plist= pobj.ProjectList()
	def userInput = input(
        id: 'userInput', message: 'input parameters', parameters: [
            [
                $class: 'ChoiceParameterDefinition',
                name: 'ChooseProject',
                choices: plist,
                description: 'ProjectList',
            ],
        ]
    )
    }
    stages {
        stage("foo") {
            steps {
                echo "flag: ${params.userFlag}"
            }
        }
    }
}
