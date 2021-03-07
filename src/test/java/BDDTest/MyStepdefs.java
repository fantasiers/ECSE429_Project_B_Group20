package BDDTest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @Given("the service is running")
    public void theServiceIsRunning() {
    }

    @Given("the project name with {string} is not in the system:")
    public void theProjectNameWithIsNotInTheSystem(String arg0) {
    }

    @When("user requests to create a project with title {string} and description {string}")
    public void userRequestsToCreateAProjectWithTitleAndDescription(String arg0, String arg1) {
    }

    @Then("the project with title {string} and description {string} should be created:")
    public void theProjectWithTitleAndDescriptionShouldBeCreated(String arg0, String arg1) {
    }

    @Given("the project name with {string} , completed status {string} is registered in the system:")
    public void theProjectNameWithCompletedStatusIsRegisteredInTheSystem(String arg0, String arg1) {
    }

    @When("user requests to change the complete status of the project with title {string}  to {string}")
    public void userRequestsToChangeTheCompleteStatusOfTheProjectWithTitleTo(String arg0, String arg1) {
    }

    @Then("the complete status of the project with title {string} will be set to {string}")
    public void theCompleteStatusOfTheProjectWithTitleWillBeSetTo(String arg0, String arg1) {
    }

    @When("user requests to create a project with title {string} and active status {string}")
    public void userRequestsToCreateAProjectWithTitleAndActiveStatus(String arg0, String arg1) {
    }

    @Then("the system should output an error code of wrong data type of active status: {string}")
    public void theSystemShouldOutputAnErrorCodeOfWrongDataTypeOfActiveStatus(String arg0) {
    }

    @Given("the todo name with {string} and description {string} is not in the system:")
    public void theTodoNameWithAndDescriptionIsNotInTheSystem(String arg0, String arg1) {
    }

    @When("user requests to create a todo with title {string} and description {string}")
    public void userRequestsToCreateATodoWithTitleAndDescription(String arg0, String arg1) {
    }

    @Then("the todo task with title {string} and description {string} should be created:")
    public void theTodoTaskWithTitleAndDescriptionShouldBeCreated(String arg0, String arg1) {
    }

    @Given("the todo task name with {string} ,  done status {string} is registered in the system:")
    public void theTodoTaskNameWithDoneStatusIsRegisteredInTheSystem(String arg0, String arg1) {
    }

    @When("user requests to change the  done status of the todo task with title {string}  to {string}")
    public void userRequestsToChangeTheDoneStatusOfTheTodoTaskWithTitleTo(String arg0, String arg1) {
    }

    @Then("the  done status of the todo task with title {string} will be set to {string}")
    public void theDoneStatusOfTheTodoTaskWithTitleWillBeSetTo(String arg0, String arg1) {
    }

    @Given("the todo name with {string} and done status {string} is not in the system:")
    public void theTodoNameWithAndDoneStatusIsNotInTheSystem(String arg0, String arg1) {
    }

    @When("user requests to create a todo with title {string} and done status {string}")
    public void userRequestsToCreateATodoWithTitleAndDoneStatus(String arg0, String arg1) {
    }

    @Then("the system should output an error code of wrong data type of doneStatus: {string}")
    public void theSystemShouldOutputAnErrorCodeOfWrongDataTypeOfDoneStatus(String arg0) {
    }

    @Given("the project name with {string} and todo name with {string} is in the system:")
    public void theProjectNameWithAndTodoNameWithIsInTheSystem(String arg0, String arg1) {
    }

    @When("user requests to add a todo task with title {string} to the project with title {string}")
    public void userRequestsToAddATodoTaskWithTitleToTheProjectWithTitle(String arg0, String arg1) {
    }

    @Then("the a todo task with title {string} will be add to the tasks list of project with title {string}")
    public void theATodoTaskWithTitleWillBeAddToTheTasksListOfProjectWithTitle(String arg0, String arg1) {
    }

    @Given("the project name with {string} is in the system")
    public void theProjectNameWithIsInTheSystem(String arg0) {
    }

    @And("the todo task name with {string} is not in the system:")
    public void theTodoTaskNameWithIsNotInTheSystem(String arg0) {
    }
    

    @And("the todo name with {string} and description {string} is in the system")
    public void theTodoNameWithAndDescriptionIsInTheSystem(String arg0, String arg1) {
    }

    @When("user requests to add a todo task with title {string} and description {string} to the project with title {string}")
    public void userRequestsToAddATodoTaskWithTitleAndDescriptionToTheProjectWithTitle(String arg0, String arg1, String arg2) {
    }

    @Then("the system should output an error code of add todo task with non-existent project id: {string}")
    public void theSystemShouldOutputAnErrorCodeOfAddTodoTaskWithNonExistentProjectId(String arg0) {
    }

    @Given("the category name with {string} is not in the system")
    public void theCategoryNameWithIsNotInTheSystem(String arg0) {
    }

    @When("user requests to create a category with title {string} and description of {string}")
    public void userRequestsToCreateACategoryWithTitleAndDescriptionOf(String arg0, String arg1) {
    }

    @Then("the category with title {string} and description {string} should be created")
    public void theCategoryWithTitleAndDescriptionShouldBeCreated(String arg0, String arg1) {
    }

    @When("user requests to create a category with title {string}")
    public void userRequestsToCreateACategoryWithTitle(String arg0) {
    }

    @Then("the category with title {string} should be created")
    public void theCategoryWithTitleShouldBeCreated(String arg0) {
    }

    @Given("the category name description of {string} is not in the system")
    public void theCategoryNameDescriptionOfIsNotInTheSystem(String arg0) {
    }

    @When("user requests to create a category with description {string}")
    public void userRequestsToCreateACategoryWithDescription(String arg0) {
    }

    @Then("the system should output an error code of create category without title: {string}")
    public void theSystemShouldOutputAnErrorCodeOfCreateCategoryWithoutTitle(String arg0) {
    }

    @And("there are these categories in the system:")
    public void thereAreTheseCategoriesInTheSystem() {
    }

    @Given("the todo task with name {string} registered in the system")
    public void theTodoTaskWithNameRegisteredInTheSystem(String arg0) {
    }

    @When("user requests to categorize a task with {string} as {string}")
    public void userRequestsToCategorizeATaskWithAs(String arg0, String arg1) {
    }

    @Then("the todo task with name {string} should be in category {string}")
    public void theTodoTaskWithNameShouldBeInCategory(String arg0, String arg1) {
    }

    @And("the todo task with name {string} has a {string} category")
    public void theTodoTaskWithNameHasACategory(String arg0, String arg1) {
    }

    @And("the category with title {string} registered in the system")
    public void theCategoryWithTitleRegisteredInTheSystem(String arg0) {
    }

    @When("user tries to remove {string} category categorization from {string}")
    public void userTriesToRemoveCategoryCategorizationFrom(String arg0, String arg1) {
    }

    @And("user requests to categorize a todo task with {string} with a new category {string}")
    public void userRequestsToCategorizeATodoTaskWithWithANewCategory(String arg0, String arg1) {
    }

    @Then("the todo task {string} should be a task with {string} category")
    public void theTodoTaskShouldBeATaskWithCategory(String arg0, String arg1) {
    }

    @Given("the todo task with name {string} is not in the system")
    public void theTodoTaskWithNameIsNotInTheSystem(String arg0) {
    }

    @When("user requests to categorize the todo task with name {string} as {string}")
    public void userRequestsToCategorizeTheTodoTaskWithNameAs(String arg0, String arg1) {
    }

    @Then("the system should output an error message of categotrizing a non-existent todo task: {string}")
    public void theSystemShouldOutputAnErrorMessageOfCategotrizingANonExistentTodoTask(String arg0) {
    }
}
