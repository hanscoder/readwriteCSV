Feature: As the developer I want to read data stored in the CSV format in order to provide an import functionality of data for my application.

  Scenario: No data provided to read.
    Given the content is empty
    When the content is read
    Then the read should be unsuccessfully processed
    And the cause should show missing data

  Scenario: One empty line ended with line delimiter to read.
    Given the content contains the line
      """
      \r\n
      """
    When the content is read
    Then the read should be unsuccessfully processed
    And the cause should show missing data

  Scenario: One line with one field containing text to read without line delimiter.
    Given the content contains the line
      """
      text1
      """
    When the content is read
    Then the read should be successfully processed
    And the number of read lines should be 1
    And the number of read fields should be 1
    And the fields should have the content
      | field1 |
      | text1  |
    And the fields should have the type
      | field1 |
      | text   |

  Scenario: One line with one field containing text to read with line delimiter.
    Given the content contains the line
      """
      text1\r\n
      """
    When the content is read
    Then the read is processed
    And the number of read lines should be 1
    And the number of read fields should be 1
    And the fields should have the content
      | field1 |
      | text1  |
    And the fields should have the type
      | field1 |
      | text   |

  Scenario: One line with two fields containing text to read.
    Given the content contains the line
      """
      text1,text2
      """
    When the content is read
    Then the read should be successfully processed
    And the number of read lines should be 1
    And the number of read fields should be 2
    And the fields should have the types
    	| field1 | field2 |
    	| text   | text   |
    And the fields should have the content
      | field1 | field2 |
      | text1  | text2  |

  Scenario: One line with more than two fields containing text to read.
    Given the content contains the line
      """
      text1,text2,text3,text4,text5,text6,text7,text8,text9,text10
      """
    When the content is read
    Then the read should be successfully processed
    And the number of read lines should be 1
    And the number of read fields should be 10
    And the fields should have the types
      | field1 | field2 | field3 | field4 | field5 | field6 | field7 | field8 | field9 | field10 |
      | text   | text   | text   | text   | text   | text   | text   | text   | text   | text    |
    And the fields should have the content
      | field1 | field2 | field3 | field4 | field5 | field6 | field7 | field8 | field9 | field10 |
      | text1  | text2  | text3  | text4  | text5  | text6  | text7  | text8  | text9  | text10  |

  Scenario: Two lines with two fields containing text to read.
    Given the content contains the lines
      """
      text1,text2\r\n
      text3,text4
      """
    When the content is read
    Then the read should be successfully processed
    And the number of read lines should be 2
    And the number of read fields should be 2
    And the fields should have the types
      | field1 | field2 |
      | text   | text   |
      | text   | text   |
    And the fields should have the content
      | field1 | field2 |
      | text1  | text2  |
      | text3  | text4  |

  Scenario: More than two lines with always one field containing text to read.
    Given the content contains the lines
      """
      text11,text12\r\n
      text21,text22\r\n
      text31,text32\r\n
      text41,text42\r\n
      text41,text42
      """
    When the content is read
    Then the read should be successfully processed
    And the number of read lines should be 2
    And the number of read fields should be 2
    And the fields should have the types
      | field1 | field2 |
      | text   | text   |
      | text   | text   |
      | text   | text   |
      | text   | text   |
      | text   | text   |
    And the fields should have the content
      | field1 | field2 |
      | text11 | text12 |
      | text21 | text22 |
      | text31 | text32 |
      | text41 | text42 |
      | text41 | text42 |

  Scenario: An other field separator as the default one is defined and used.
    Given the content contains the line
      """
      text11|text12
      """
    And the separator is |
    When the content is read
    Then the read should be successfully processed
    And the number of read lines should be 1
    And the number of read fields should be 2
    And the fields should have the types
      | field1 | field2 |
      | text   | text   |
    And the fields should have the content
      | field1 | field2 |
      | text11 | text12 |

  Scenario: An other field separator is used as defined.
    Given the content contains the line
      """
      text11,text12
      """
    And the separator is |
    When the content is read
    Then the read should be unsuccessfully processed
    And the cause should show that , is used as a separator but | was defined as separator
    And the possible solution should show that either change the used separator to | or change the defined separator to ,

  Scenario: The second line has more fields than the first line
    Given the content contains the line
      """
      text11,text12\r\n
      text21
      """
    When the content is read
    Then the read should be unsuccessfully processed
    And the cause should show that the line 2 miss the field 2
    And the possible solution should show that the line 2 has to enhanced with the field 2

  Scenario: The second line has less fields than the first line
    Given the content contains the line
      """
      text11\r\n
      text21,text22
      """
    When the content is read
    Then the read should be unsuccessfully processed
    And the cause should show that the line 2 has to much fields
    And the possible solution should show that the line 2 has to much fields

  Scenario: An other line delimiter as defined is used.
    Given the content contains the line
      """
      text11,text12\r\n
      """
    And the line delimiter is \n
    When the content is read
    Then the read should be unsuccessfully processed
    And the cause should show that \r\n is used as a line delimiter but \n was defined as line delimiter
    And the possible solution should show that either change the used line delimiter to \n or change the defined line delimiter to \r\n

  Scenario: A defined line delimiter is used as data in a field and therefore the field must be enclosed by double-quotes.
    Given the content contains the line
      """
      "text\r\n12"\r\n
      """
    And the line delimiter is \r\n
    When the content is read
    Then the read should be sucessfully processed
    And the number of read lines should be 1
    And the number of read fields should be 1
    And the fields should have the types
      | field1 |
      | text   |
    And the fields should have the content
      | field1      |
      | text\\r\n12 |

  Scenario: Double quote is used in a field as content and must be escaped by one doublequote.
    Given the content contains the line
      """
      text ""hello""\r\n
      """
    And the line delimiter is \r\n
    When the content is read
    Then the read should be sucessfully processed
    And the number of read lines should be 1
    And the number of read fields should be 1
    And the fields should have the types
      | field1 |
      | text   |
    And the fields should have the content
      | field1       |
      | text "hello" |

  Scenario: One double quote is in a field but no closing double quotes.
    Given the content contains the line
      """
      text "hello\r\n
      """
    And the line delimiter is \r\n
    When the content is read
    Then the read should be unsuccessfully processed
    And the cause should show that \r\n is used as a line delimiter but \n was defined as line delimiter
    And the possible solution should show that either change the used line delimiter to \n or change the defined line delimiter to \r\n
