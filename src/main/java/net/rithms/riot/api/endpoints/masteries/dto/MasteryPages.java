/*
 * Copyright 2014 Taylor Caldwell
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

package net.rithms.riot.api.endpoints.masteries.dto;

import java.io.Serializable;
import java.util.Set;

import net.rithms.riot.api.Dto;

public class MasteryPages extends Dto implements Serializable {

	private static final long serialVersionUID = 2574314573359467443L;

	private Set<MasteryPage> pages;
	private long summonerId;

	/**
	 * Utility method to get the current rune page.
	 * 
	 * @return Current mastery page, or {@code null} if there is no such mastery page.
	 */
	public MasteryPage getCurrentPage() {
		Set<MasteryPage> pages = getPages();
		if (pages != null) {
			for (MasteryPage page : pages) {
				if (page.isCurrent()) {
					return page;
				}
			}
		}
		return null;
	}

	public Set<MasteryPage> getPages() {
		return pages;
	}

	public long getSummonerId() {
		return summonerId;
	}

	@Override
	public String toString() {
		return getPages().toString();
	}
}