package com.givval.blog.readwritecsv.read.it;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ReadSteps {

	@Given("^the content is empty$")
	public void the_content_is_empty() throws Throwable {
		throw new PendingException();
	}

	@When("^the content is read$")
	public void the_content_is_read() throws Throwable {
		throw new PendingException();
	}

	@Then("^the read should be unsuccessfully processed$")
	public void the_read_should_be_unsuccessfully_processed() throws Throwable {
		throw new PendingException();
	}
	
	@Then("^the cause should show missing data$")
	public void the_cause_should_show_missing_data() throws Throwable {
		throw new PendingException();
	}

	@Given("^the content contains the (?:line|lines)$")
	public void the_content_contains_the_line(String line) throws Throwable {
		throw new PendingException();
	}

	@Then("^the read should be successfully processed$")
	public void the_read_should_be_successfully_processed() throws Throwable {
		throw new PendingException();
	}

	@Then("^the number of read lines should be (\\d+)$")
	public void the_number_of_read_lines_should_be(int numberOfLines) throws Throwable {
		throw new PendingException();
	}

	@Then("^the number of read fields should be (\\d+)$")
	public void the_number_of_read_fields_should_be(int numberOfFields) throws Throwable {
		throw new PendingException();
	}

	@Then("^the fields should have the content$")
	public void the_fields_should_have_the_content(DataTable fields)
			throws Throwable {
		throw new PendingException();
	}

	@Then("^the fields should have the (?:type|types)$")
	public void the_fields_should_have_the_types(DataTable types)
			throws Throwable {
		throw new PendingException();
	}

	@Then("^the read is processed$")
	public void the_read_is_processed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^the separator is (.*)$")
	public void the_separator_is(String separator) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^the cause should show that (.*) is used as a separator but (.*) was defined as separator$")
	public void the_cause_should_show_that_is_used_as_a_separator_but_was_defined_as_separator(String usedSeparator, String definedSeparator)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^the possible solution should show that either change the used separator to (.*) or change the defined separator to (.*)$")
	public void the_possible_solution_should_show_that_either_change_the_used_separator_to_or_change_the_defined_separator_to(String usedSeparator, String definedSeparator)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^the cause should show that the line (\\d+) miss the field (\\d+)$")
	public void the_cause_should_show_that_the_line_miss_the_field(
			int numberOfLine, int numberOfField) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^the possible solution should show that the line (\\d+) has to enhanced with the field (\\d+)$")
	public void the_possible_solution_should_show_that_the_line_has_to_enhanced_with_the_second_field(
			int numberOfLine, int numberOfField) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^the cause should show that the line (\\d+) has to much fields$")
	public void the_cause_should_show_that_the_line_has_to_much_fields(int arg1)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^the possible solution should show that the line (\\d+) has to much fields$")
	public void the_possible_solution_should_show_that_the_line_has_to_much_fields(
			int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^the line delimiter is (.*)$")
	public void the_line_delimiter_is(String delimiter) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^the cause should show that (.*) is used as a line delimiter but (.*) was defined as line delimiter$")
	public void the_cause_should_show_that_x_is_used_as_a_line_delimiter_but_z_was_defined_as_line_delimiter(String usedDelimiter, String definedDelimiter)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}
	
	@Then("^the possible solution should show that either change the used line delimiter to (.*) or change the defined line delimiter to (.*)$")
	public void the_possible_solution_should_show_that_either_change_the_used_line_delimiter_to_n_or_change_the_defined_line_delimiter_to_r_n(String usedDelimiter, String definedDelimiter) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^the read should be sucessfully processed$")
	public void the_read_should_be_sucessfully_processed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}
	
}
