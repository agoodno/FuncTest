/*
 * Copyright (c) 2006 Consolidated Court Automation Programs.
 * All rights reserved.
 */
package gov.wicourts.functest;

import java.io.FileNotFoundException;

/**
 * ClasspathDataSetNotFoundException
 */
public class ClasspathDataSetNotFoundException extends FileNotFoundException {

	public ClasspathDataSetNotFoundException(String fileName)
	{
		super("DataSet file not found: classpath:/" + fileName);
	}
}
