package org.ff4j.test;

/*-
 * #%L
 * ff4j-core
 * %%
 * Copyright (C) 2013 - 2019 FF4J
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import java.io.InputStream;

import org.ff4j.parser.ConfigurationFileParser;
import org.ff4j.parser.FF4jConfigFile;

/**
 * Configuration test.
 *
 * @author Cedrick LUNVEN (@clunven)
 */
public class TestConfigurationParser extends ConfigurationFileParser implements FF4jTestDataSet {

    /** {@inheritDoc} */
    @Override
    public FF4jConfigFile parse(InputStream inputStream) {
        return expectConfig();
    }

    @Override
    public String export(FF4jConfigFile config) {
        return "N/A";
    }

}