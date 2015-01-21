<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="form">
	<h2 class="blog-post-title">
		<s:property value="getText('profile.form')" />
	</h2>
	<s:form action="modifier" method="post">

		<s:textfield label="%{getText('nom')}" type="text"
			name="utilisateur.nom" value="" placeholder="%{getText('nom')}"
			size="20" maxlength="20"></s:textfield>
		<s:textfield label="%{getText('prenom')}" type="text"
			name="utilisateur.prenom" value="" placeholder="%{getText('prenom')}"
			size="20" maxlength="20"></s:textfield>
		<s:textfield label="%{getText('login')}" type="text"
			name="utilisateur.login" value="" placeholder="%{getText('login')}"
			size="20" maxlength="20"></s:textfield>
		<s:textfield label="%{getText('mailaddress')}" type="email"
			name="utilisateur.mail" value=""
			placeholder="%{getText('mailaddress')}"></s:textfield>
		<s:textfield label="%{getText('password')}" type="password"
			name="utilisateur.password" value=""
			placeholder="%{getText('password')}" size="20" maxlength="20"></s:textfield>
		<%-- 		<s:textfield label="%{getText('password.again')}" type="password" --%>
		<%-- 			name="utilisateur.password" value="" --%>
		<%-- 			placeholder="%{getText('password')}" size="20" maxlength="20"></s:textfield> --%>
		<h2>Renseignements complémentaires</h2>
		<s:select label="%{getText('country')}" list="pays"
			name="ficheutilisateur.pays"></s:select>
		<s:textfield label="%{getText('address')}" type="text"
			name="ficheutilisateur.adresse" value=""
			placeholder="%{getText('address')}" size="20" maxlength="20"></s:textfield>
		<s:textfield label="%{getText('city')}" type="text"
			name="ficheutilisateur.ville" value=""
			placeholder="%{getText('city')}" size="20" maxlength="20"></s:textfield>
		<s:textfield label="%{getText('zipcode')}" type="text"
			name="ficheutilisateur.codepostal" value=""
			placeholder="%{getText('zipcode')}" size="20" maxlength="20"></s:textfield>
		<s:select label="%{getText('style')}" list="style"
			name="utilisateur.style"></s:select>
		<s:file></s:file>
		<s:checkboxlist label="%{getText('interests')}" list="interets"
			listKey="id" listValue="nom"></s:checkboxlist>
		<s:submit type="submit" value="%{getText('update')}"></s:submit>
	</s:form>
</div>