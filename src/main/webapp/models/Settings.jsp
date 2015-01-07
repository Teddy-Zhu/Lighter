<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ include file="/models/header.jsp"%>
<body data-spy="scroll" data-target="#SettingsScrollspy">
	<div class="container">
		<div class="row">
			<div class="col-md-2">
				<div data-spy="affix" data-offset-top="160">
					<div class="widget-box">
						<div class="widget-title">
							<span class="icon"><span
								class="glyphicon glyphicon-th-large"></span><i class="icon-file"></i></span>
							<h5>设置选项</h5>
						</div>
						<div class="widget-content nopadding" id="SettingsScrollspy">
							<ul class="nav nav-tabs nav-stacked">
								<li><a href="#section-1">第一部分</a></li>
								<li><a href="#section-2">第二部分</a></li>
								<li><a href="#section-3">第三部分</a></li>
								<li><a href="#section-4">第四部分</a></li>
								<li><a href="#section-5">第五部分</a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-10
			">
				<div class="widget-box">
					<div class="widget-title popovershow">
						<span class="icon"><span class="glyphicon glyphicon-cog"></span><i
							class="icon-comment"></i></span>
						<h5>详细设置</h5>
						<span title="total comments" class="label label-info"
							data-toggle="popover" data-placement="left" data-content="总计88个">88</span>
					</div>

					<h2 id="section-1">第一部分</h2>
					<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam
						eu sem tempor, varius quam at, luctus dui. Mauris magna metus,
						dapibus nec turpis vel, semper malesuada ante. Vestibulum id metus
						ac nisl bibendum scelerisque non non purus. Suspendisse varius
						nibh non aliquet sagittis. In tincidunt orci sit amet elementum
						vestibulum. Vivamus fermentum in arcu in aliquam. Quisque aliquam
						porta odio in fringilla. Vivamus nisl leo, blandit at bibendum eu,
						tristique eget risus. Integer aliquet quam ut elit suscipit, id
						interdum neque porttitor. Integer faucibus ligula.</p>
					<p>Vestibulum quis quam ut magna consequat faucibus.
						Pellentesque eget nisi a mi suscipit tincidunt. Ut tempus dictum
						risus. Pellentesque viverra sagittis quam at mattis. Suspendisse
						potenti. Aliquam sit amet gravida nibh, facilisis gravida odio.
						Phasellus auctor velit at lacus blandit, commodo iaculis justo
						viverra. Etiam vitae est arcu. Mauris vel congue dolor. Aliquam
						eget mi mi. Fusce quam tortor, commodo ac dui quis, bibendum
						viverra erat. Maecenas mattis lectus enim, quis tincidunt dui
						molestie euismod. Curabitur et diam tristique, accumsan nunc eu,
						hendrerit tellus.</p>
					<hr>
					<h2 id="section-2">第二部分</h2>
					<p>Nullam hendrerit justo non leo aliquet imperdiet. Etiam in
						sagittis lectus. Suspendisse ultrices placerat accumsan. Mauris
						quis dapibus orci. In dapibus velit blandit pharetra tincidunt.
						Quisque non sapien nec lacus condimentum facilisis ut iaculis
						enim. Sed viverra interdum bibendum. Donec ac sollicitudin dolor.
						Sed fringilla vitae lacus at rutrum. Phasellus congue vestibulum
						ligula sed consequat.</p>
					<p>Vestibulum consectetur scelerisque lacus, ac fermentum lorem
						convallis sed. Nam odio tortor, dictum quis malesuada at,
						pellentesque vitae orci. Vivamus elementum, felis eu auctor
						lobortis, diam velit egestas lacus, quis fermentum metus ante quis
						urna. Sed at facilisis libero. Cum sociis natoque penatibus et
						magnis dis parturient montes, nascetur ridiculus mus. Vestibulum
						bibendum blandit dolor. Nunc orci dolor, molestie nec nibh in,
						hendrerit tincidunt ante. Vivamus sem augue, hendrerit non sapien
						in, mollis ornare augue.</p>
					<hr>
					<h2 id="section-3">第三部分</h2>
					<p>Integer pulvinar leo id risus pellentesque vestibulum. Sed
						diam libero, sodales eget sapien vel, porttitor bibendum enim.
						Donec sed nibh vitae lorem porttitor blandit in nec ante.
						Pellentesque vitae metus ipsum. Phasellus sed nunc ac sem
						malesuada condimentum. Etiam in aliquam lectus. Nam vel sapien
						diam. Donec pharetra id arcu eget blandit. Proin imperdiet mattis
						augue in porttitor. Quisque tempus enim id lobortis feugiat.
						Suspendisse tincidunt risus quis dolor fringilla blandit. Ut sed
						sapien at purus lacinia porttitor. Nullam iaculis, felis a pretium
						ornare, dolor nisl semper tortor, vel sagittis lacus est consequat
						eros. Sed id pretium nisl. Curabitur dolor nisl, laoreet vitae
						aliquam id, tincidunt sit amet mauris.</p>
					<p>Phasellus vitae suscipit justo. Mauris pharetra feugiat ante
						id lacinia. Etiam faucibus mauris id tempor egestas. Duis luctus
						turpis at accumsan tincidunt. Phasellus risus risus, volutpat vel
						tellus ac, tincidunt fringilla massa. Etiam hendrerit dolor eget
						ante rutrum adipiscing. Cras interdum ipsum mattis, tempus mauris
						vel, semper ipsum. Duis sed dolor ut enim lobortis pellentesque
						ultricies ac ligula. Pellentesque convallis elit nisi, id
						vulputate ipsum ullamcorper ut. Cras ac pulvinar purus, ac viverra
						est. Suspendisse potenti. Integer pellentesque neque et elementum
						tempus. Curabitur bibendum in ligula ut rhoncus.</p>
					<p>Quisque pharetra velit id velit iaculis pretium. Nullam a
						justo sed ligula porta semper eu quis enim. Pellentesque
						pellentesque, metus at facilisis hendrerit, lectus velit facilisis
						leo, quis volutpat turpis arcu quis enim. Nulla viverra lorem
						elementum interdum ultricies. Suspendisse accumsan quam nec ante
						mollis tempus. Morbi vel accumsan diam, eget convallis tellus.
						Suspendisse potenti.</p>
					<hr>
					<h2 id="section-4">第四部分</h2>
					<p>Suspendisse a orci facilisis, dignissim tortor vitae,
						ultrices mi. Vestibulum a iaculis lacus. Phasellus vitae convallis
						ligula, nec volutpat tellus. Vivamus scelerisque mollis nisl, nec
						vehicula elit egestas a. Sed luctus metus id mi gravida, faucibus
						convallis neque pretium. Maecenas quis sapien ut leo fringilla
						tempor vitae sit amet leo. Donec imperdiet tempus placerat.
						Pellentesque pulvinar ultrices nunc sed ultrices. Morbi vel mi
						pretium, fermentum lacus et, viverra tellus. Phasellus sodales
						libero nec dui convallis, sit amet fermentum sapien auctor.
						Vestibulum ante ipsum primis in faucibus orci luctus et ultrices
						posuere cubilia Curae; Sed eu elementum nibh, quis varius libero.</p>
					<p>Vestibulum quis quam ut magna consequat faucibus.
						Pellentesque eget nisi a mi suscipit tincidunt. Ut tempus dictum
						risus. Pellentesque viverra sagittis quam at mattis. Suspendisse
						potenti. Aliquam sit amet gravida nibh, facilisis gravida odio.
						Phasellus auctor velit at lacus blandit, commodo iaculis justo
						viverra. Etiam vitae est arcu. Mauris vel congue dolor. Aliquam
						eget mi mi. Fusce quam tortor, commodo ac dui quis, bibendum
						viverra erat. Maecenas mattis lectus enim, quis tincidunt dui
						molestie euismod. Curabitur et diam tristique, accumsan nunc eu,
						hendrerit tellus.</p>
					<p>Phasellus fermentum, neque sit amet sodales tempor, enim
						ante interdum eros, eget luctus ipsum eros ut ligula. Nunc ornare
						erat quis faucibus molestie. Proin malesuada consequat commodo.
						Mauris iaculis, eros ut dapibus luctus, massa enim elementum
						purus, sit amet tristique purus purus nec felis. Morbi vestibulum
						sapien eget porta pulvinar. Nam at quam diam. Proin rhoncus, felis
						elementum accumsan dictum, felis nisi vestibulum tellus, et
						ultrices risus felis in orci. Quisque vestibulum sem nisl, vel
						congue leo dictum nec. Cras eget est at velit sagittis ullamcorper
						vel et lectus. In hac habitasse platea dictumst. Etiam interdum
						iaculis velit, vel sollicitudin lorem feugiat sit amet. Etiam
						luctus, quam sed sodales aliquam, lorem libero hendrerit urna,
						faucibus rhoncus massa nibh at felis. Curabitur ac tempus nulla,
						ut semper erat. Vivamus porta ullamcorper sem, ornare egestas
						mauris facilisis id.</p>
					<p>Ut ut risus nisl. Fusce porttitor eros at magna luctus, non
						congue nulla eleifend. Aenean porttitor feugiat dolor sit amet
						facilisis. Pellentesque venenatis magna et risus commodo, a
						commodo turpis gravida. Nam mollis massa dapibus urna aliquet,
						quis iaculis elit sodales. Sed eget ornare orci, eu malesuada
						justo. Nunc lacus augue, dictum quis dui id, lacinia congue quam.
						Nulla sem sem, aliquam nec dolor ac, tempus convallis nunc.
						Interdum et malesuada fames ac ante ipsum primis in faucibus.
						Nulla suscipit convallis iaculis. Quisque eget commodo ligula.
						Praesent leo dui, facilisis quis eleifend in, aliquet vitae nunc.
						Suspendisse fermentum odio ac massa ultricies pellentesque. Fusce
						eu suscipit massa.</p>
					<hr>
					<h2 id="section-5">第五部分</h2>
					<p>Nam eget purus nec est consectetur vehicula. Nullam ultrices
						nisl risus, in viverra libero egestas sit amet. Etiam porttitor
						dolor non eros pulvinar malesuada. Vestibulum sit amet est mollis
						nulla tempus aliquet. Praesent luctus hendrerit arcu non laoreet.
						Morbi consequat placerat magna, ac ornare odio sagittis sed. Donec
						vitae ullamcorper purus. Vivamus non metus ac justo porta
						volutpat.</p>
					<p>Vivamus mattis accumsan erat, vel convallis risus pretium
						nec. Integer nunc nulla, viverra ut sem non, scelerisque vehicula
						arcu. Fusce bibendum convallis augue sit amet lobortis. Cras porta
						urna turpis, sodales lobortis purus adipiscing id. Maecenas
						ullamcorper, turpis suscipit pellentesque fringilla, massa lacus
						pulvinar mi, nec dignissim velit arcu eget purus. Nam at dapibus
						tellus, eget euismod nisl. Ut eget venenatis sapien. Vivamus
						vulputate varius mauris, vel varius nisl facilisis ac. Nulla
						aliquet justo a nibh ornare, eu congue neque rutrum.</p>
					<p>Suspendisse a orci facilisis, dignissim tortor vitae,
						ultrices mi. Vestibulum a iaculis lacus. Phasellus vitae convallis
						ligula, nec volutpat tellus. Vivamus scelerisque mollis nisl, nec
						vehicula elit egestas a. Sed luctus metus id mi gravida, faucibus
						convallis neque pretium. Maecenas quis sapien ut leo fringilla
						tempor vitae sit amet leo. Donec imperdiet tempus placerat.
						Pellentesque pulvinar ultrices nunc sed ultrices. Morbi vel mi
						pretium, fermentum lacus et, viverra tellus. Phasellus sodales
						libero nec dui convallis, sit amet fermentum sapien auctor.
						Vestibulum ante ipsum primis in faucibus orci luctus et ultrices
						posuere cubilia Curae; Sed eu elementum nibh, quis varius libero.</p>
					<p>Morbi sed fermentum ipsum. Morbi a orci vulputate tortor
						ornare blandit a quis orci. Donec aliquam sodales gravida. In ut
						ullamcorper nisi, ac pretium velit. Vestibulum vitae lectus
						volutpat, consequat lorem sit amet, pulvinar tellus. In tincidunt
						vel leo eget pulvinar. Curabitur a eros non lacus malesuada
						aliquam. Praesent et tempus odio. Integer a quam nunc. In hac
						habitasse platea dictumst. Aliquam porta nibh nulla, et mattis
						turpis placerat eget. Pellentesque dui diam, pellentesque vel
						gravida id, accumsan eu magna. Sed a semper arcu, ut dignissim
						leo.</p>
					<p>Sed vitae lobortis diam, id molestie magna. Aliquam
						consequat ipsum quis est dictum ultrices. Aenean nibh velit,
						fringilla in diam id, blandit hendrerit lacus. Donec vehicula
						rutrum tellus eget fermentum. Pellentesque ac erat et arcu ornare
						tincidunt. Aliquam erat volutpat. Vivamus lobortis urna quis
						gravida semper. In condimentum, est a faucibus luctus, mi dolor
						cursus mi, id vehicula arcu risus a nibh. Pellentesque blandit
						sapien lacus, vel vehicula nunc feugiat sit amet.</p>

				</div>
			</div>
		</div>
	</div>
	</div>
</body>
<%@ include file="/models/footer.jsp"%>