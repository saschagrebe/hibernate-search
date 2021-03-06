/*
 * Hibernate Search, full-text search for your domain model
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.search.query.dsl;

import org.apache.lucene.search.Sort;

/**
 * @author Sascha Grebe
 */
public interface GroupingParameterContext extends GroupingTermination {

	/**
	 * The sorting of the groups.
	 *
	 * @param groupSort
	 * @return
	 */
	GroupingParameterContext groupSort(Sort groupSort);

	/**
	 * The sorting within the group.
	 *
	 * @param withinGroupSort
	 * @return
	 */
	GroupingParameterContext withinGroupSort(Sort withinGroupSort);

	/**
	 * The maimum number of fetched documents per group. Needs to be greater than 0. The default is 1.
	 *
	 * @param maxDocsPerGroup
	 * @return
	 */
	GroupingParameterContext maxDocsPerGroup(int maxDocsPerGroup);

	/**
	 * The offset of the first group (skip the first n groups). Used for pagination.
	 *
	 * @param groupOffset
	 * @return
	 */
	GroupingParameterContext groupOffset(int groupOffset);

	/**
	 * Calculate total group count. When this option is enabled all groups are calculated to determine how many groups
	 * exist. The default is set to true.
	 */
	GroupingParameterContext calculateTotalGroupCount(boolean calculateTotalGroupCount);
}
