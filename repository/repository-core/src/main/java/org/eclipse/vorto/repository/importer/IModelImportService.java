/**
 * Copyright (c) 2018 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.vorto.repository.importer;

import java.util.List;
import java.util.Optional;

public interface IModelImportService {
  /**
   * 
   * @return a list of all registered model importers
   */
  List<IModelImporter> getImporters();

  /**
   * Gets an importer by its key
   * 
   * @param key
   * @return
   */
  Optional<IModelImporter> getImporterByKey(String key);
}
