/*
 * Copyright 2017-2021 the original author or authors.
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
package org.koin.core.context

import org.koin.core.KoinApplication
import org.koin.core.module.Module
import org.koin.dsl.KoinAppDeclaration
import org.koin.mp.PlatformTools

/**
 * Start a Koin Application as StandAlone
 */
fun startKoin(koinApplication: KoinApplication): KoinApplication = PlatformTools.defaultContext().startKoin(koinApplication)

/**
 * Start a Koin Application as StandAlone
 */
fun startKoin(appDeclaration: KoinAppDeclaration): KoinApplication = PlatformTools.defaultContext().startKoin(appDeclaration)

/**
 * Stop current StandAlone Koin application
 */
fun stopKoin() = PlatformTools.defaultContext().stopKoin()

/**
 * load Koin module in global Koin context
 */
fun loadKoinModules(module: Module) = PlatformTools.defaultContext().loadKoinModules(module)

/**
 * load Koin modules in global Koin context
 */
fun loadKoinModules(modules: List<Module>) = PlatformTools.defaultContext().loadKoinModules(modules)

/**
 * unload Koin modules from global Koin context
 */
fun unloadKoinModules(module: Module) = PlatformTools.defaultContext().unloadKoinModules(module)

/**
 * unload Koin modules from global Koin context
 */
fun unloadKoinModules(modules: List<Module>) = PlatformTools.defaultContext().unloadKoinModules(modules)