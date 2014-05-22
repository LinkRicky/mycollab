/**
 * This file is part of mycollab-web.
 *
 * mycollab-web is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-web is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-web.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.esofthead.mycollab.module.project.localization;

import ch.qos.cal10n.BaseName;
import ch.qos.cal10n.Locale;
import ch.qos.cal10n.LocaleData;

@BaseName("localization/project/risk")
@LocaleData({ @Locale("en_US"), @Locale("ja_JP") })
public enum RiskI18nEnum {
	LIST_VIEW_TITLE,
	NEW_RISK_ACTION,
	
	FORM_READ_TITLE,
	FORM_NAME,
	FORM_DESCRIPTION,
	FORM_RAISED_BY,
	FORM_RELATED,
	FORM_DATE_DUE,
	FORM_STATUS,
	FORM_RESPONSE,
	FORM_CONSEQUENCE,
	FORM_PROBABILITY,
	FORM_RATING
}
