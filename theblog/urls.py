from django.urls import path
# from . import views
from .views import homeView, detailView

urlpatterns = [
    # path('', views.home, name='home'),
    path('', homeView.as_view(), name='home'),
    path('article/<int:pk>', detailView.as_view(), name='article-detail')
]
