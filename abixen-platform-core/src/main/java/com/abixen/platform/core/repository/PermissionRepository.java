/**
 * Copyright (c) 2010-present Abixen Systems. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.abixen.platform.core.repository;

import com.abixen.platform.core.model.enumtype.PermissionName;
import com.abixen.platform.core.model.impl.Permission;
import com.abixen.platform.core.model.impl.PermissionAclClassCategory;
import com.abixen.platform.core.repository.custom.PlatformJpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;



public interface PermissionRepository extends PlatformJpaRepository<Permission, Long>, JpaSpecificationExecutor<Permission> {

    List<Permission> findAllByPermissionAclClassCategory(PermissionAclClassCategory permissionAclClassCategory);

    Permission findByPermissionName(PermissionName permissionName);

}