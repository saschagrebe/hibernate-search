/*
 * Hibernate Search, full-text search for your domain model
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.search.query.engine.spi;

import java.io.IOException;

import org.hibernate.search.query.grouping.GroupingRequest;
import org.hibernate.search.query.grouping.GroupingResult;

/**
 * The manager used for all grouping related operation.
 *
 * @author Sascha Grebe
 */
public interface GroupingManager {

	/**
	 * Request the search result to be grouped.
	 *
	 * @param grouping
	 */
	void group(GroupingRequest grouping);

	/**
	 * @return The grouping request
	 */
	GroupingRequest getGrouping();

	/**
	 * Provide the grouped search result.
	 *
	 * @param groupingResult
	 * @throws IOException
	 */
	void setGroupingResult(GroupingResult groupingResult) throws IOException;

	/**
	 * @return The grouped search result.
	 */
	GroupingResult getGroupingResult() throws IOException;

}