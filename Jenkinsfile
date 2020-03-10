node{
    def userInput = input(
        id: 'userInput', message: 'input parameters', parameters: [
            [
                $class: 'ChoiceParameterDefinition',
                name: 'ChooseProject',
                choices: findProject(),
                description: 'ProjectList',
            ],
        ]
    )

    echo ("Selected AMI :: "+userInput)
}
