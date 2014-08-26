/*
 * Copyright 2012-2014 the original author or authors.
 *
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
 */

package io.spring.initializr.web.support

import com.gargoylesoftware.htmlunit.html.HtmlPage
import com.gargoylesoftware.htmlunit.html.HtmlSelect

/**
 * The default home page.
 *
 * @author Stephane Nicoll
 */
class DefaultHomePage extends HomePage {

	DefaultHomePage(HtmlPage page) {
		super(page)
	}

	@Override
	protected void setup() {
		super.setup()
		select('type', type)
		select('packaging', packaging)
	}

	private void select(String selectId, String value) {
		if (value != null) {
			HtmlSelect input = page.getHtmlElementById(selectId)
			input.setSelectedAttribute(value, true)
		}
	}
}
