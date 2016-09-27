package com.givval.blog.readwritecsv.read.it;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java8.En;
import org.omg.IOP.ENCODING_CDR_ENCAPS;

public class ReadSteps implements En {

	public ReadSteps() {

		Given("^the content is empty$", () -> {
			throw new PendingException();
		});

		When("^the content is read$", () -> {
			throw new PendingException();

		});

		Then("^the read should be unsuccessfully processed$", () -> {
			throw new PendingException();
		});

		Then("^the cause should show missing data$", () -> {
			throw new PendingException();
		});

		Given("^the content contains the (?:line|lines)$", (String line) -> {
			throw new PendingException();
		});

		Then("^the read should be successfully processed$", () -> {
			throw new PendingException();
		});

		Then("^the number of read lines should be (\\d+)$", (Integer numberOfLines) -> {
			throw new PendingException();
		});

		Then("^the number of read fields should be (\\d+)$", (Integer numberOfFields) ->  {
			throw new PendingException();
		});

		Then("^the fields should have the content$", (DataTable fields) -> {
			throw new PendingException();
		});

		Then("^the fields should have the (?:type|types)$", (DataTable types) -> {
			throw new PendingException();
		});

		Then("^the read is processed$", () ->  {
			throw new PendingException();
		});

		Given("^the separator is (.*)$", (String separator) ->  {
			throw new PendingException();
		});

		Then("^the cause should show that (.*) is used as a separator but (.*) was defined as separator$", (String usedSeparator, String definedSeparator) -> {
			throw new PendingException();
		});

		Then("^the possible solution should show that either change the used separator to (.*) or change the defined separator to (.*)$",
				(String usedSeparator, String definedSeparator) -> {
			throw new PendingException();
		});

		Then("^the cause should show that the line (\\d+) miss the field (\\d+)$", (Integer numberOfLine, Integer numberOfField) -> {
			throw new PendingException();
		});

		Then("^the possible solution should show that the line (\\d+) has to enhanced with the field (\\d+)$",
				(Integer numberOfLine, Integer numberOfField) -> {
			throw new PendingException();
		});

		Then("^the cause should show that the line (\\d+) has to much fields$", (Integer lineNumber) -> {
			throw new PendingException();
		});

		Then("^the possible solution should show that the line (\\d+) has to much fields$", (Integer lineNumber) -> {
			throw new PendingException();
		});

		Given("^the line delimiter is (.*)$", (String delimiter) -> {
			throw new PendingException();
		});

		Then("^the cause should show that (.*) is used as a line delimiter but (.*) was defined as line delimiter$",
				(String usedDelimiter, String definedDelimiter) -> {
			throw new PendingException();
		});

		Then("^the possible solution should show that either change the used line delimiter to (.*) or change the defined line delimiter to (.*)$",
				(String usedDelimiter, String definedDelimiter) -> {
			throw new PendingException();
		});

		Then("^the read should be sucessfully processed$", () -> {
			throw new PendingException();
		});

	}

}
