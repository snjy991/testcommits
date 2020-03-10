node{
    def plist=load ProjectList.groovy
     List<String> plist= plist.ProjectList
   
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

    echo ("Selected AMI :: "+userInput)
}
