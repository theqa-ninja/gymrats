module Api
  class UsersController < ApplicationController
    def index
      render json: Users.all
    end

    def show
      user_id = params[:id]
      if Users.exists?(user_id)
        render json: Users.find(user_id)
      else
        render json: {status: 400, message: "invalid id"}.to_json
      end
    end

    def search
      query = params[:query]
      users = Users.where('display_name LIKE ?' +
        ' OR email LIKE ?',
        "%#{query}%","%#{query}%")
        render json: users
    end

    def new
      newUserInfo = Hash.new
      newUserInfo['display_name'] = params[:display_name]
      newUserInfo['email'] = params[:email]
      newUserInfo['password'] = params[:password]
      newUser = Users.new(newUserInfo)
      if newUser.save!
        render json: newUser
      else
        render json: {status: 400, message: "error creating user"}.to_json
      end
    end

    def edit
      user_id = params[:id]
      render json: {status: 400, message: "invalid id"} if !Users.exists?(user_id)
      updated_user = Users.find(user_id)
      updated_user.display_name = params[:display_name] if params[:display_name]
      updated_user.email = params[:email] if params[:email]
      updated_user.password = params[:password] if params[:password]
      if updated_user.save!
        render json: updated_user
      else
        render json: {status: 400, message: "error updating user"}.to_json
      end
    end

    def destroy
      user_id = params[:id]
      if Users.exists?(user_id)
        Users.delete(user_id)
        render json: {status: 200, message: "deleted!"}
      end
      render json: {status: 400, message: "invalid id"}
    end
  end
end

