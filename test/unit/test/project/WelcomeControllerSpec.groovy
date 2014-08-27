package test.project

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(WelcomeController)
class WelcomeControllerSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test concatenate"() {
        when: "Two strings are passed to the concatenate method"
            def welcomeController = new WelcomeController()
        then: "The concatenate method will combine them"
            welcomeController.concatenate("Hello","World") == "HelloWorld"
    }

    void "test multiply"() {
        when: "Two numbers are passed to the multiply method"
        def welcomeController = new WelcomeController()
        then: "The multiply method will multiply them"
        welcomeController.multiply(142,13) == 1846
    }

    void "test add"() {
        when: "Two numbers are passed to the add method"
        def welcomeController = new WelcomeController()
        then: "The add method will add them"
        welcomeController.add(203,72) == 275
    }
}
