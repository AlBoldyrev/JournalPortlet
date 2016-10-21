/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.softwerke.srv.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ReviewLocalService}.
 *
 * @author Sasha
 * @see ReviewLocalService
 * @generated
 */
public class ReviewLocalServiceWrapper implements ReviewLocalService,
	ServiceWrapper<ReviewLocalService> {
	public ReviewLocalServiceWrapper(ReviewLocalService reviewLocalService) {
		_reviewLocalService = reviewLocalService;
	}

	/**
	* Adds the review to the database. Also notifies the appropriate model listeners.
	*
	* @param review the review
	* @return the review that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.softwerke.srv.model.Review addReview(
		com.softwerke.srv.model.Review review)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _reviewLocalService.addReview(review);
	}

	/**
	* Creates a new review with the primary key. Does not add the review to the database.
	*
	* @param reviewId the primary key for the new review
	* @return the new review
	*/
	@Override
	public com.softwerke.srv.model.Review createReview(long reviewId) {
		return _reviewLocalService.createReview(reviewId);
	}

	/**
	* Deletes the review with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param reviewId the primary key of the review
	* @return the review that was removed
	* @throws PortalException if a review with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.softwerke.srv.model.Review deleteReview(long reviewId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _reviewLocalService.deleteReview(reviewId);
	}

	/**
	* Deletes the review from the database. Also notifies the appropriate model listeners.
	*
	* @param review the review
	* @return the review that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.softwerke.srv.model.Review deleteReview(
		com.softwerke.srv.model.Review review)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _reviewLocalService.deleteReview(review);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _reviewLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _reviewLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.softwerke.srv.model.impl.ReviewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _reviewLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.softwerke.srv.model.impl.ReviewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _reviewLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _reviewLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _reviewLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.softwerke.srv.model.Review fetchReview(long reviewId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _reviewLocalService.fetchReview(reviewId);
	}

	/**
	* Returns the review matching the UUID and group.
	*
	* @param uuid the review's UUID
	* @param groupId the primary key of the group
	* @return the matching review, or <code>null</code> if a matching review could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.softwerke.srv.model.Review fetchReviewByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _reviewLocalService.fetchReviewByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the review with the primary key.
	*
	* @param reviewId the primary key of the review
	* @return the review
	* @throws PortalException if a review with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.softwerke.srv.model.Review getReview(long reviewId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _reviewLocalService.getReview(reviewId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _reviewLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the review matching the UUID and group.
	*
	* @param uuid the review's UUID
	* @param groupId the primary key of the group
	* @return the matching review
	* @throws PortalException if a matching review could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.softwerke.srv.model.Review getReviewByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _reviewLocalService.getReviewByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the reviews.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.softwerke.srv.model.impl.ReviewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of reviews
	* @param end the upper bound of the range of reviews (not inclusive)
	* @return the range of reviews
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.softwerke.srv.model.Review> getReviews(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _reviewLocalService.getReviews(start, end);
	}

	/**
	* Returns the number of reviews.
	*
	* @return the number of reviews
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getReviewsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _reviewLocalService.getReviewsCount();
	}

	/**
	* Updates the review in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param review the review
	* @return the review that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.softwerke.srv.model.Review updateReview(
		com.softwerke.srv.model.Review review)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _reviewLocalService.updateReview(review);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _reviewLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_reviewLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _reviewLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public java.util.List<com.softwerke.srv.model.Review> getByArticleId(
		long articleId) {
		return _reviewLocalService.getByArticleId(articleId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ReviewLocalService getWrappedReviewLocalService() {
		return _reviewLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedReviewLocalService(
		ReviewLocalService reviewLocalService) {
		_reviewLocalService = reviewLocalService;
	}

	@Override
	public ReviewLocalService getWrappedService() {
		return _reviewLocalService;
	}

	@Override
	public void setWrappedService(ReviewLocalService reviewLocalService) {
		_reviewLocalService = reviewLocalService;
	}

	private ReviewLocalService _reviewLocalService;
}