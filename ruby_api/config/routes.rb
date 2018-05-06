Rails.application.routes.draw do
  # For details on the DSL available within this file, see http://guides.rubyonrails.org/routing.html
  namespace :api do
    resources :users, only: [:index, :new, :edit, :show, :destroy] do
      get :search, on: :collection
    end
  end
end
