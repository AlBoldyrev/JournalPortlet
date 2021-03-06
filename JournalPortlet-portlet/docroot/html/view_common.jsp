<%@ page import="com.softwerke.journalportlet.models.ArticleModel"%>
<%@ page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@ page import="com.softwerke.srv.service.ArticleLocalServiceUtil"%>
<%@ page import="com.liferay.portal.kernel.exception.PortalException"%>
<%@ page import="com.softwerke.journalportlet.util.Constants"%>
<%@ page import="javax.portlet.WindowState"%>
<%@ page import="com.liferay.portal.kernel.servlet.SessionMessages"%>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil"%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<liferay-theme:defineObjects />
<portlet:defineObjects />

	<portlet:renderURL var="viewCommonVar">
		<portlet:param name="pageName" 	value="<%=Constants.VIEW_COMMON%>" />
	</portlet:renderURL>
	
	<portlet:renderURL var="viewAuthorVar">
		<portlet:param name="pageName" 	value="<%=Constants.VIEW_AUTHOR%>" />
	</portlet:renderURL>
	
	<portlet:renderURL var="viewGeneralReviewerVar">
		<portlet:param name="pageName" 	value="<%=Constants.VIEW_GENERAL_REVIEWER%>" />
	</portlet:renderURL>
	
<aui:nav cssClass="nav-tabs navigation">
	<aui:nav-item cssClass="navigation navigation__item" label="Journal" href="${viewCommonVar}" />
		
		<c:forEach items="${roleList}" var="role">
			
			<c:if test="${role.name == 'Author'}">
				<aui:nav-item cssClass="navigation navigation__item" label="Author" href="${viewAuthorVar}" />
			</c:if>
			<c:if test="${role.name == 'General Reviewer'}">
				<aui:nav-item cssClass="navigation navigation__item" label="General Reviewer" href="${viewGeneralReviewerVar}" />
			</c:if>
			
		</c:forEach>
</aui:nav>

<liferay-ui:error key="internal-error-please-try-later" message="internal-error-please-try-later" />

<div class="container-fluid" id="myContainer">

	<aui:form name="journalForm" id="journalForm">

		<c:forEach items="${articlePublishedModelList}" varStatus="counter"
			var="article">
			
			<portlet:renderURL var="viewArticleVar">
				<portlet:param name="pageName" 	value="<%=Constants.VIEW_ARTICLE%>" />
				<portlet:param name="articleId" value="${article.articleId}" />
			</portlet:renderURL>
			
			<portlet:renderURL var="reviewArticleVar">
				<portlet:param name="pageName"	value="<%=Constants.ADD_REVIEW%>" />
				<portlet:param name="articleId" value="${article.articleId}" />
			</portlet:renderURL>


			<div class="span3">

				<c:if test="${(counter.index % 3) == 0}">
					<div class="article animated fadeInLeft">
				</c:if>
				<c:if test="${(counter.index % 3) == 1}">
					<div class="article animated fadeInDown">
				</c:if>
				<c:if test="${(counter.index % 3) == 2}">
					<div class="article animated fadeInRight">
				</c:if>
				<div class="well">
					<h3>${article.articleName}</h3>
					<div class="article__content ">
						<div class="seo-header">Click to view content</div>
						<div class="seo-content morecontent">
 							<p class="text-success">${article.articleContent}</p>
						</div>
					</div>

					<liferay-ui:icon-menu triggerCssClass="btn btn-group-vertical"
						direction="right" showArrow="false" message="Actions">
						
						<liferay-ui:icon iconCssClass="icon-eye-open"
							cssClass="article__content_color-view"
							message="View Article Content" url="${viewArticleVar}"></liferay-ui:icon>
						<liferay-ui:icon iconCssClass="icon-edit"
							cssClass="article__content_color-edit"
							message="Add Article Review" url="${reviewArticleVar}"></liferay-ui:icon>
							
					</liferay-ui:icon-menu>

				</div>
			</div>
</div>
</c:forEach>
</aui:form>
</div>

<button class="loadMore">Load more</button>
<button class="showLess">Show less</button>
