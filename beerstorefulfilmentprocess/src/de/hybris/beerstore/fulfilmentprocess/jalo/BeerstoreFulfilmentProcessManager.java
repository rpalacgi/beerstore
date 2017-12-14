/*
 * [y] hybris Platform
 *
 * Copyright (c) 2017 SAP SE or an SAP affiliate company.  All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.beerstore.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.beerstore.fulfilmentprocess.constants.BeerstoreFulfilmentProcessConstants;

@SuppressWarnings("PMD")
public class BeerstoreFulfilmentProcessManager extends GeneratedBeerstoreFulfilmentProcessManager
{
	public static final BeerstoreFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (BeerstoreFulfilmentProcessManager) em.getExtension(BeerstoreFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
