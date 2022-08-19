/*******************************************************************************
 * Copyright (c) 2017 David Gileadi and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     David Gileadi - initial API and implementation
 *******************************************************************************/
package org.eclipse.jdt.ls.core.internal.managers;

import java.util.HashSet;
import java.util.Set;

public class LanguageProviderManager {


	private static Set<ILanguageProvider> languages = new HashSet<ILanguageProvider>();;

    public LanguageProviderManager() {}

    public static Set<ILanguageProvider> getLanguageProviders() {
        return languages;
    }

    public static void registerLanguageProvider(ILanguageProvider languageProvider) {
        languages.add(languageProvider);
    }
}
