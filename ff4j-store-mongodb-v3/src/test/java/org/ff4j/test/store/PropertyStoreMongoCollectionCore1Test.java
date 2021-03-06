package org.ff4j.test.store;

import org.ff4j.mongo.mapper.PropertyDocumentBuilder;
import org.ff4j.mongo.store.PropertyStoreMongo;

/*
 * #%L
 * ff4j-store-mongodb-v3
 * %%
 * Copyright (C) 2013 - 2016 FF4J
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


import org.ff4j.property.store.PropertyStore;
import org.ff4j.test.propertystore.PropertyStoreTestSupport;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

import com.github.fakemongo.junit.FongoRule;

/**
 * Unit testing of MongoDB Store.
 *
 * @author <a href="mailto:cedrick.lunven@gmail.com">Cedrick LUNVEN</a>
 */
public class PropertyStoreMongoCollectionCore1Test extends PropertyStoreTestSupport {

    /**
     * DataBase.
     */
    @Rule
    public FongoRule fongoRule = new FongoRule(false);

     /** {@inheritDoc} */
    protected PropertyStore initPropertyStore() {
        PropertyStoreMongo propertyStoreMongo = new PropertyStoreMongo(fongoRule.getMongoClient());
        propertyStoreMongo.importPropertiesFromXmlFile("test-ff4j-features.xml");

        return propertyStoreMongo;
    }
    
    @Test
    public void testInit() {
        PropertyDocumentBuilder pod = new PropertyDocumentBuilder ();
        Assert.assertNotNull(pod.getDescription("a"));
        Assert.assertNotNull(pod.getType("a"));
        Assert.assertNotNull(pod.getFixedValues("a"));
    }


}
