/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License;
 * you may not use this file except in compliance with the Elastic License.
 */
package org.elasticsearch.xpack.sql.qa.single_node;

import org.elasticsearch.xpack.sql.qa.jdbc.CsvSpecTestCase;
import org.elasticsearch.xpack.sql.qa.jdbc.CsvTestUtils.CsvTestCase;

public class JdbcCsvSpecIT extends CsvSpecTestCase {
    public JdbcCsvSpecIT(String fileName, String groupName, String testName, Integer lineNumber, CsvTestCase testCase) {
        super(fileName, groupName, testName, lineNumber, testCase);
    }
}