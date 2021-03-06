/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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

package org.gnenc.dlusagereports.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import org.gnenc.dlusagereports.model.AllocatedStorage;

/**
 * The persistence interface for the AllocatedStorage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Drew A. Blessing
 * @see AllocatedStoragePersistenceImpl
 * @see AllocatedStorageUtil
 * @generated
 */
public interface AllocatedStoragePersistence extends BasePersistence<AllocatedStorage> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AllocatedStorageUtil} to access the AllocatedStorage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the AllocatedStorage in the entity cache if it is enabled.
	*
	* @param allocatedStorage the AllocatedStorage
	*/
	public void cacheResult(
		org.gnenc.dlusagereports.model.AllocatedStorage allocatedStorage);

	/**
	* Caches the AllocatedStorages in the entity cache if it is enabled.
	*
	* @param allocatedStorages the AllocatedStorages
	*/
	public void cacheResult(
		java.util.List<org.gnenc.dlusagereports.model.AllocatedStorage> allocatedStorages);

	/**
	* Creates a new AllocatedStorage with the primary key. Does not add the AllocatedStorage to the database.
	*
	* @param id the primary key for the new AllocatedStorage
	* @return the new AllocatedStorage
	*/
	public org.gnenc.dlusagereports.model.AllocatedStorage create(long id);

	/**
	* Removes the AllocatedStorage with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the AllocatedStorage
	* @return the AllocatedStorage that was removed
	* @throws org.gnenc.dlusagereports.NoSuchAllocatedStorageException if a AllocatedStorage with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.gnenc.dlusagereports.model.AllocatedStorage remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.gnenc.dlusagereports.NoSuchAllocatedStorageException;

	public org.gnenc.dlusagereports.model.AllocatedStorage updateImpl(
		org.gnenc.dlusagereports.model.AllocatedStorage allocatedStorage,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the AllocatedStorage with the primary key or throws a {@link org.gnenc.dlusagereports.NoSuchAllocatedStorageException} if it could not be found.
	*
	* @param id the primary key of the AllocatedStorage
	* @return the AllocatedStorage
	* @throws org.gnenc.dlusagereports.NoSuchAllocatedStorageException if a AllocatedStorage with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.gnenc.dlusagereports.model.AllocatedStorage findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.gnenc.dlusagereports.NoSuchAllocatedStorageException;

	/**
	* Returns the AllocatedStorage with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the AllocatedStorage
	* @return the AllocatedStorage, or <code>null</code> if a AllocatedStorage with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.gnenc.dlusagereports.model.AllocatedStorage fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the AllocatedStorages.
	*
	* @return the AllocatedStorages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.gnenc.dlusagereports.model.AllocatedStorage> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the AllocatedStorages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of AllocatedStorages
	* @param end the upper bound of the range of AllocatedStorages (not inclusive)
	* @return the range of AllocatedStorages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.gnenc.dlusagereports.model.AllocatedStorage> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the AllocatedStorages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of AllocatedStorages
	* @param end the upper bound of the range of AllocatedStorages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of AllocatedStorages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.gnenc.dlusagereports.model.AllocatedStorage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the AllocatedStorages from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of AllocatedStorages.
	*
	* @return the number of AllocatedStorages
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}