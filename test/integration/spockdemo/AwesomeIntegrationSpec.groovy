package spockdemo

import grails.test.spock.IntegrationSpec

class AwesomeIntegrationSpec extends IntegrationSpec {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
    }

    void "test a method in a controller"() { 
        given: 'Foo Controller'
        def value = 1

        and: 'with authorized user'
        def second_value  = 2

        and: 'with request parameter set'
        def third_value =3 

        when: 'create is called'
        value = value +  10 

        then: 'check redirect url and error message'
        value == 15
    }


}
