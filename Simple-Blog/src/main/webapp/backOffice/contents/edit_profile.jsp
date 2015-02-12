<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="form">
	<h2 class="blog-post-title">
		<s:property value="getText('profile.form')" />
	</h2>
	<s:form action="modifier" method="post">

		<s:textfield label="%{getText('nom')}" type="text"
			name="utilisateur.nom" value="%{#utilisateur.nom}"
			placeholder="%{getText('nom')}" size="20" maxlength="20"></s:textfield>
		<s:textfield label="%{getText('prenom')}" type="text"
			name="utilisateur.prenom" value="%{#utilisateur.prenom}"
			placeholder="%{getText('prenom')}" size="20" maxlength="20"></s:textfield>
		<s:textfield label="%{getText('login')}" type="text"
			name="utilisateur.username" value="%{#utilisateur.username}"
			placeholder="%{getText('login')}" size="20" maxlength="20"></s:textfield>
		<s:textfield label="%{getText('mailaddress')}" type="email"
			name="utilisateur.mail" value="%{#utilisateur.mail}"
			placeholder="%{getText('mailaddress')}"></s:textfield>
		<s:textfield label="%{getText('password')}" type="password"
			name="utilisateur.password" value=""
			placeholder="%{getText('password')}" size="20" maxlength="20"></s:textfield>
		<%-- 		<s:textfield label="%{getText('password.again')}" type="password" --%>
		<%-- 			name="utilisateur.password" value="" --%>
		<%-- 			placeholder="%{getText('password')}" size="20" maxlength="20"></s:textfield> --%>



		<h2>Renseignements complémentaires</h2>



		<s:textfield label="%{getText('address')}" type="text"
			name="ficheUtilisateur.adresse" value="%{#session.adresse}"
			placeholder="%{getText('address')}" size="20" maxlength="20"></s:textfield>
		<s:textfield label="%{getText('city')} " type="text"
			name="ficheUtilisateur.ville" value="%{#session.ville}"
			placeholder="%{getText('city')}" size="20" maxlength="20"></s:textfield>
		<s:textfield label="%{getText('zipcode')} " type="text"
			name="ficheUtilisateur.codePostal" value="%{#session.codepostal}"
			placeholder="%{getText('zipcode')}" size="20" maxlength="20"></s:textfield>
		<s:select label="%{getText('country')} " list="ensemblePays"
			value="%{#session.paysId}" listKey="id" listValue="nom"
			name="ficheUtilisateur.pays.id"></s:select>
		<s:checkboxlist label="%{getText('interests')} " list="interets"
			value="%{#session.interets}" listKey="id" listValue="nom"
			name="interet.nom"></s:checkboxlist>
		<s:radio label="%{getText('style')} " list="styles" listKey="id"
			value="%{#session.styleId}" listValue="nom" name="style.id"></s:radio>
		<s:submit type="submit" value="%{getText('update')}" align="center"></s:submit>
		<%-- 		<s:file ></s:file> --%>

	</s:form>
</div>